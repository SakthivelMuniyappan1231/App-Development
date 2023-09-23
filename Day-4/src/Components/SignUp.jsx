import React, { useState } from 'react';
import ab from "./login-bg.png"
import '../Assets/css/SignUp.css';
import { Link } from 'react-router-dom';
const SignUp = () => {
  const [formdata, setFormdata] = useState({
    firstname: "",
    lastname: "",
    emailId: "",
    password: "",
    confirmpassword: ""
  });

  const handleOnChange = (e) => {
    const { name, value } = e.target;
    setFormdata({
      ...formdata,
      [name]: value
    });
  };

  const submitForm = (e) => {
    e.preventDefault();
    console.log(formdata);
  };

  return (
    <div className="signup-container">
      <div className="signup-img">
        <img src={ab} alt="login-bg" />
      </div>
        <div className="signup-form">
            <form action="" onSubmit={submitForm}>
                <h4>Sign Up</h4>
                <label for="firstname">FIRST NAME:</label>
                <input type="text" name="firstname" id="firstname" placeholder='Enter your firstname' required onChange={handleOnChange} minLength={3} maxLength={20} />

                <label for="lastname">LAST NAME:</label>
                <input type="text" name="lastname" id="lastname" placeholder='Enter your lastname' required onChange={handleOnChange} minLength={3} maxLength={20}/>

               <label for="emailId">EMAIL ID:</label>
               <input type="text" name="emailId" id="emailId" placeholder='Enter your email' required onChange={handleOnChange} />

               <label for="password">PASSWORD:</label>
               <input type="password" name="password" id="password" placeholder='Enter your password' required onChange={handleOnChange} minLength={8} maxLength={15}/>

              <label for="confirmpassword">CONFIRM PASSWORD:</label>
              <input type="password" name="confirmpassword" id="confirmpassword"  placeholder='Confirm your password'required onChange={handleOnChange}minLength={8} maxLength={15}/>

              <button type="submit">Submit</button>
            </form>
            <p className="new-sign"> 
              Already have an account? <Link to="/">Login</Link>
            </p>

        </div>
    </div>
  );
}
export default SignUp;