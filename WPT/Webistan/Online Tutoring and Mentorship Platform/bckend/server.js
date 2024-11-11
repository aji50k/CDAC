const express = require('express');
const mysql = require('mysql2');
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
  console.log('Connected to MySQL');
});

app.post('/api/mentors', (req, res) => {
  const { name, subject, experience, email, bio, image_url } = req.body;
  const query = 'INSERT INTO mentors (name, subject, experience, email, bio, image_url) VALUES (?, ?, ?, ?, ?, ?)';
  db.query(query, [name, subject, experience, email, bio, image_url], (err, result) => {
    if (err) throw err;
    res.json({ message: 'Mentor added successfully', mentorId: result.insertId });
  });
});

app.get('/api/mentors', (req, res) => {
  const { subject } = req.query;
  let query = 'SELECT * FROM mentors';
  const params = [];

  if (subject) {
    query += ' WHERE subject = ?';
    params.push(subject);
  }

  db.query(query, params, (err, results) => {
    if (err) throw err;
    res.json(results);
  });
});


app.put('/api/mentors/:id', (req, res) => {
  const { id } = req.params;
  const { name, subject, experience, email, bio, image_url } = req.body;
  const query = 'UPDATE mentors SET name = ?, subject = ?, experience = ?, email = ?, bio = ?, image_url = ? WHERE id = ?';
  db.query(query, [name, subject, experience, email, bio, image_url, id], (err, result) => {
    if (err) throw err;
    res.json({ message: 'Mentor updated successfully' });
  });
});

app.delete('/api/mentors/:id', (req, res) => {
  const { id } = req.params;
  const query = 'DELETE FROM mentors WHERE id = ?';
  db.query(query, [id], (err, result) => {
    if (err) throw err;
    res.json({ message: 'Mentor deleted successfully' });
  });
});

const PORT = 5000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
