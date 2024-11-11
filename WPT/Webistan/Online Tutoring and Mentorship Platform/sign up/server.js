const express = require('express');
const mysql = require('mysql2');
const bcrypt = require('bcryptjs');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(bodyParser.json());


const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '', 
  database: 'webistan'
});

db.connect(err => {
  if (err) throw err;
  console.log('Connected to MySQL database');
});


app.post('/api/signup', async (req, res) => {
  const { firstName, lastName, email, password } = req.body;

 
  const checkUserQuery = 'SELECT * FROM users WHERE email = ?';
  db.query(checkUserQuery, [email], async (err, results) => {
    if (err) {
      res.status(500).json({ message: 'Database error' });
      return;
    }

    if (results.length > 0) {
      res.status(409).json({ message: 'Email already in use' });
      return;
    }

  
    const hashedPassword = await bcrypt.hash(password, 10);

    const insertUserQuery = 'INSERT INTO users (first_name, last_name, email, password) VALUES (?, ?, ?, ?)';
    db.query(insertUserQuery, [firstName, lastName, email, hashedPassword], (err, result) => {
      if (err) {
        res.status(500).json({ message: 'Error registering user' });
        return;
      }
      res.status(201).json({ message: 'User registered successfully' });
    });
  });
});

const PORT = 5000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
