import React, { Component } from "react";
import ReactRoundedImage from "react-rounded-image";
import guest from "../Assests/guest.png";
import room from "../Assests/room.png";
import booking from "../Assests/booking.png";
import staff from "../Assests/staff.jpg";
import {withRouter} from 'react-router-dom';
import Home from '@material-ui/icons/Home';
import { Container, Row, Col,FormGroup } from "reactstrap";

 class Header extends Component {
  HomeHandler(user) {
    console.log("Home")
    if (user === "Home") {
      this.props.history.push({
        pathname: "/",
       
      });
    }
  }
  BookingHandler(user) {
    console.log("book")
    if (user === "Booking") {
      this.props.history.push({
        pathname: "/Booking",
       
      });
    }
  }
  GuestHandler(user) {
    console.log("Guest")
    if (user === "Guest") {
      this.props.history.push({
        pathname: "/Guest",
       
      });
    }
  }
  StaffHandler(user) {
    console.log("Staff")
    if (user === "Staff") {
      this.props.history.push({
        pathname: "/Staff",
       
      });
    }
  }
  RoomHandler(user) {
    console.log("Room")
    if (user === "Room") {
      this.props.history.push({
        pathname: "/Room",
       
      });
    }
  }
  render() {
  

  return (
    <React.Fragment>
      <div
        className="container"
        style={{
          color: "white",
          background: "#020716",

          fontSize: "12px",
          padding: "5px",
          justifyContent: "center",
          alignItems: "center",
          textAlign: "center",
        }}
      >
        <a
           onClick={() => this.HomeHandler("Home")}
          style={{
            color: "white",
            cursor: "pointer",
            fontFamily: "sans-serif",
          }}
        >
           HOTEL MANAGEMNET MODEL
        </a>
      </div>
<Row>
       <div
        className="container"
        style={{
          height: "85px",
          color: "white",

          background: "#2C3E50",
          textAlign: "center",
        }}
       >
        &nbsp;
        <Col>
       <div  style={{
            display: "flex",
            marginTop: "-13px",
            alignItems: "center",

          }}>
          <div
          style={{
            display: "flex",
            marginTop: "14px",
            alignItems: "center", 
          }}
          onClick={() => this.HomeHandler("Home")}
            
        >
           
           
           <a
             onClick={() => this.HomeHandler("Home")}
             style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
           >
             <Home  style={{ fontSize: 34 }}/>
           </a>
         </div>
         </div>
         &nbsp;&nbsp;
         &nbsp;&nbsp;
         </Col>
         
         </div>
         <Col>
        <div
          style={{
            display: "flex",
            marginTop: "-82px",
            alignItems: "center",

            justifyContent: "center",
          }}
        >
          
          <div
            style={{
              marginInline: "3px",
              cursor: "pointer",
            }}
            onClick={() => this.GuestHandler("Guest")}
          >
            <ReactRoundedImage
              imageWidth="52"
              imageHeight="52"
              roundedSize="10"
              borderRadius="10"
              hoverColor="#DD1144"
              image={guest}
            />
            <a
            onClick={() => this.GuestHandler("Guest")}
              style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
            >
              GUEST
            </a>
          </div>
          &nbsp;&nbsp;
          &nbsp;&nbsp;
          <div
            style={{ marginInline: "3px", cursor: "pointer" }}
            onClick={() => this.RoomHandler("Room")}
          >
            <ReactRoundedImage
              imageWidth="52"
              imageHeight="52"
              roundedSize="10"
              borderRadius="10"
              hoverColor="#DD1144"
               image={room}
            />
            <a
            onClick={() => this.RoomHandler("Room")}
              style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
            >
              ROOMS
            </a>
          </div>
          &nbsp;&nbsp;
          &nbsp;&nbsp;
          <div
            style={{ marginInline: "3px", cursor: "pointer" }}
            onClick={() => this.BookingHandler("Booking")}
            
          >
            <ReactRoundedImage
              imageWidth="52"
              imageHeight="52"
              roundedSize="10"
              borderRadius="10"
              hoverColor="#DD1144"
              image={booking}
            />
            <a
              onClick={() => this.BookingHandler("Booking")}
              style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
            >
              BOOKING
            </a>
          </div>
          &nbsp;&nbsp;
          &nbsp;&nbsp;
          <div
            style={{ marginInline: "3px", cursor: "pointer" }}
            onClick={() => this.StaffHandler("Staff")}
          >
            <ReactRoundedImage
              imageWidth="52"
              imageHeight="52"
              roundedSize="10"
              borderRadius="10"
              hoverColor="#DD1144"
              image={staff}
            />
            <a
             onClick={() => this.StaffHandler("Staff")}
              style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
            >
              STAFF
            </a>
          </div>
          &nbsp;&nbsp;
         
        </div>
        </Col>
        
        
        </Row>
    </React.Fragment>
  );
}
}

export default withRouter(Header);
