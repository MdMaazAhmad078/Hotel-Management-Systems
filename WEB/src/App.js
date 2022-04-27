import "./App.css";
// import Login from './Components/Login';
import Footer from "./Components/Footer";
import Header from "./Components/Header";
import Home from "./Components/Home";
import Guest from "./Components/Guest";
import Room from "./Components/Room";
import Booking from "./Components/Booking";
import Booking_List from "./Components/Booking_List";
import Staff from "./Components/Staff";
import Add_Staff from "./Components/Add_Staff";
import { BrowserRouter } from "react-router-dom";
import { Route, Link } from "react-router-dom";

function App() {
  return (
    <div className="App">
      
      <BrowserRouter>
      <div>
      <Header/>
      <Route  path="/" exact component={Home} />
      <Route  path='/Guest' component={Guest} />
      <Route  path='/Room' component={Room} />
      <Route  path='/Staff' component={Staff} />
      <Route  path='/Add_Staff' component={Add_Staff} />
       <Route  path='/Booking' component={Booking} />
       <Route  path='/Booking_List' component={Booking_List} />
      </div>
      

        

       
      </BrowserRouter>
      <Footer />
    </div>
  );
}


export default App;
