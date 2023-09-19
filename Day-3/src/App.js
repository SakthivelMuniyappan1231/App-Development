import * as React from 'react';
import './assets/css/App.css';
import Login from './components/Login';
import SignUp from './components/SignUp';
import{BrowserRouter as Router,Route,Routes} from 'react-router-dom';
function App() {
  return (
    <div >
      <Router>
        <Routes>
          <Route path='/' elements={<Login/>}></Route>
          <Route path='/signUp' elements={<SignUp/>}></Route>
        </Routes>
      </Router>
    </div>
  );
}
export default App;
