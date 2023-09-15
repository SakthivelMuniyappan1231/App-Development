import React from 'react';
import ReactDOM from 'react-dom/client';
import Login from './components/Login';
import SignUp from './components/SignUp';
import './assets/css/App.css';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <SignUp/>
    
  </React.StrictMode>
);

