import * as React from 'react';
import '../Assets/css/Login.css';
import ab from "./login-bg.png"
import { Link} from 'react-router-dom';


const Login = () => {
  const [formdata, setFormdata] = React.useState({
    username: "",
    password: "",
   
   
  });

  const handleOnChange = (e) => {
    const { name, value } = e.target;
    setFormdata({
      ...formdata,
      [name]: value,
    });
  };

  const submitForm = (e) => {
    e.preventDefault();
    console.log(formdata);
  };


  return (
    <div className="login-container">
      <div className="login-img">
        <img src={ab} alt="login-bg" />
      </div>
      <div className="login-form">
        <form action="" onSubmit={submitForm}>
          <h4>Login</h4>
          <label For="username">USERNAME:</label>
          <input type="text" name="username" id="username" placeholder='username' required onChange={handleOnChange} minLength={3} maxLength={20} />

          <label For="password">PASSWORD:</label>
          <input type="password" name="password" id="password" placeholder='password' required onChange={handleOnChange} minLength={8} maxLength={15}/>

          <p className="forget-password">
            <Link className="forgot" href="/">
              Forgot Password?
            </Link>
          </p>
          <button type="login">Login</button>
        </form>
          <p className="new"> 
            Don't have an account? <Link to="/signup">Sign up</Link>
          </p>
      </div>
    </div>
  );
}

export default Login;