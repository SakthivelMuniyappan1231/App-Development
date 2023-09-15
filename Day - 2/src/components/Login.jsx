import * as React from 'react';
import '../assets/css/Login.css';
const Login=()=>
{
      
    const[formdata,setFormdata]=React.useState({
        username:"",
        password:""
    })
    const handleOnChange = (e)=>{
          const [name,value]=[e.target.name,e.target.value];
          setFormdata({
            ...formdata,
            [name]:value
          })

    }
    const submitForm = (e) =>{
        e.preventDefault();
        console.log(formdata);

    }




    return(
        <form action="" onSubmit={submitForm}>
            <div className='login-form'>
               <label for="firstname">USER NAME</label>
            <input type='text' name='username' id='username' required onChange={handleOnChange}/>
               <label for="firstname">PASSWORD </label>
            <input type='password' name='password' id='password' required onChange={handleOnChange}/>
               <button type='submit'>Login</button>
            </div>
            
        </form>
    )
}
export default Login;