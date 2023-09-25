import Dashboard from './components/admin/Dashboard/Dashboard';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Customer from './components/admin/Customer/Customer';
import Login from './components/Login';
import Signup from './components/Signup';
import Overview from './components/admin/Overview/Overview';
import Services from './components/admin/Services/Services';
import Categorys from './components/admin/Categorys/Categorys';
import Policy from './components/admin/Policy/Policy';


function App() {

  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path='/' element={<Login/>}></Route>
          <Route path='/signup' element={<Signup/>}></Route>
          <Route path='/adminServices' element={<Services/>}></Route>
          <Route path='/adminCategorys' element={<Categorys/>}></Route>
          <Route path='/adminOverview' element={<Overview/>}></Route>
          <Route path='/adminCustomer' element={<Customer/>}></Route>
          <Route path='/adminDashboard' element={<Dashboard/>}></Route>
          <Route path='/adminPolicy' element={<Policy/>}></Route>

        </Routes>
      </Router>
    </div>
  );
}

export default App;
