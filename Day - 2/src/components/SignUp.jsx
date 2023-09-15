import * as React from 'react';
// import ab from "./img.avif"
const SignUp=()=>
{
      
    const[formdata,setFormdata]=React.useState({
        firstname:"",
        lastname:"",
        emailId:"",
        password:"",
        confirmpassword:""
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
            {/* <div className="signup-img"> */}
                {/* <img src={ab}/> */}
            {/* </div> */}
            <div className='form-group'>  
                <label for="firstname">FIRST NAME :</label>
                <input type='text' name='firstname' id='firstname' required onChange={handleOnChange}/>
                <label for="firstname">LAST NAME :</label>
                <input type='text' name='lastname' id='lastname' required onChange={handleOnChange}/>
                <label for="firstname">EMAIL ID :</label>
                <input type='text' name='emailId' id='emailId' required onChange={handleOnChange}/>
                <label for="firstname">PASSWORD :</label>
                <input type='password' name='password' id='password' required onChange={handleOnChange}/>
                <label for="firstname">CONFIRM PASSWORD :</label>
                <input type='password' name='confirmpassword' id='confirmpassword'required onChange={handleOnChange}/>
                <button type='submit'>SignUp</button>
                  
            </div>

        
        </form>
        
       
    )
}
export default SignUp;