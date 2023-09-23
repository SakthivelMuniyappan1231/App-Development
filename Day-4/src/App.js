import React from 'react';
import { Routes, Route, BrowserRouter } from 'react-router-dom';
import Login from './Components/Login';
import SignUp from './Components/SignUp';
import './Assets/css/App.css';
import './Assets/css/Login.css';
import './Assets/css/SignUp.css';

import MainDash from './Components/MainDash/MainDash';
import RigtSide from './Components/RigtSide/RightSide';
import Sidebar from './Components/Sidebar';
function App() {
  return (
    <div className='App'>
      
      <Sidebar/>
      <MainDash/>
      <RigtSide/>
         
    </div>
  );
}
export default App;