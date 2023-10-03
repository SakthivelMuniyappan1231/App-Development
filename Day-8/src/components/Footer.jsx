import React from 'react'
import './admin/Dashboard/Dashboard.css'
import {Link} from 'react-router-dom'

const Footer = () => {
      return( 
            <div className='footer'>
                  <Link className='f' to="/adminTerms">Terms and Conditions</Link>
                  <Link className='f' to="/adminPolicy">Privacy Policies</Link>
                  <Link className='f'>FAQ</Link>
            </div>
      )
}

export default Footer
