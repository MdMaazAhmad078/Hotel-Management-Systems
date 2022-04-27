import React, { Component } from "react";
import { Button, Form, Label, Input } from "reactstrap";
import { Container, Row, Col, FormGroup } from "reactstrap";
import Box from "@material-ui/core/Box";
import TextField from "@material-ui/core/TextField";
import axios from "axios";
import "./Banner.css";

export default class Booking extends Component {
  constructor(props) {
    super(props);

    this.state = {
      GetlistofRoom: [],
      age: "",
      lastName: "",
      firstName: "",
      addharNumber: "",
      panNumber: "",
      email: "",
      phoneNumber: "",
      permanentAddress: "",
      secondaryAddress: "",
      city: "",
      state: "",
      pinCode: "",
      checkIn: "",
      checkOut: "",
      numberOfGuest: "",
      roomNo: "",
      totalAmount: "",
      errmsg: "",

      specialRequest: "",
    };
  
  }
  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value,
    });
  };

  BookingListHandler(user) {
    console.log("Booking List");
    if (user === "Booking_List") {
      this.props.history.push({
        pathname: "./Booking_List",
      });
    }
  }
  handleSubmit = () => {
    // e.preventDefault()
    console.log("submit handler", this.state);

    console.log(this.state);
    axios
      .post("http://127.0.0.1:8081/Controller/CreateReservation", this.state)
      .then((response) => {
        console.log("response", response);
        if (response.status === 200) {
          this.props.history.push({
            pathname: "./Booking_List",
          });
        }
      })

      .catch((error) => {
        console.log("error", error);
      });
  };

  componentDidMount = () => {
    console.log("calling component by shahid");
    this.getListOfAvailableRoom();
  };

  getListOfAvailableRoom = () => {
    axios
      .get("http://localhost:8081/Controller/ getListofAvailableRooms")

      .then((response) => {
        console.log("response", response.data);
        if (response.status === 200) {
          console.log("in if condition");
          this.setState({
            GetlistofRoom: response.data,
          });
        } else {
          this.setState({
            GetlistofRoom: [],
          });
        }
      })
      .catch((error) => {
        console.log(error);
      });
  };
  // createGuest = () => {
  //   const data = {
  //     aadharNumber: this.state.addharNumber,
  //     age: this.state.age,
  //     checkIn: this.state.checkIn,
  //     checkOut: this.state.checkOut,
  //     firstName: this.state.firstName,
  //     lastName: this.state.lastName,
  //     phoneNumber: this.state.phoneNumber,
  //     roomId: this.state.roomId,
  //   };
  //   axios
  //     .post("http://localhost:8081/Controller/CreateGuest", data)

  //     .then((response) => {
  //       console.log("response", response.status);
  //     })
  //     .catch((error) => {
  //       console.log(error);
  //     });
  // };
  render() {
    return (
     
        <div>
          <Form className="bigformbg">
            <h2> Enter Guest Detail's</h2>
            <Button
              className="button-design"
              variant="contained"
              onClick={() => this.BookingListHandler("Booking_List")}
              style={{
                marginTop: "-1.4%",
                marginRight: "2%",
                marginLeft: "10px",
                float: "right",
                backgroundColor: "#305de2",
                color: "white",
                padding: "11px 27px 9px",
              }}
            >
              Booking List
            </Button>

            <br />
            <Label style={{ marginRight: "22%" }}>Presonal Detail's:</Label>
            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "25ch" },
              }}
              noValidate
              autoComplete="off"
            >
              <TextField
                label="First Name:"
                variant="filled"
                value={this.state.firstName}
                name="firstName"
                onChange={this.handleChange}
              />
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
              <TextField
                id="filled"
                label="Last Name:"
                value={this.state.lastName}
                name="lastName"
                onChange={this.handleChange}
                variant="filled"
              />
            </Box>
            <br />
            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "25ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "16%" }}
            >
              <TextField
                id="filled"
                label="Age:"
                value={this.state.age}
                name="age"
                onChange={this.handleChange}
                variant="filled"
              />
            </Box>

            <br />
            <Label style={{ marginRight: "27%" }}>ID:</Label>

            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "55ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "" }}
            >
              <TextField
                id="filled"
                label="Addhar Number:"
                name="addharNumber"
                value={this.state.addharNumber}
                onChange={this.handleChange}
                variant="filled"
              />
              <br /> <br />
              <TextField
                id="filled"
                name="panNumber"
                label="Pan No(Optional)*:"
                value={this.state.panNumber}
                onChange={this.handleChange}
                variant="filled"
              ></TextField>
              <br /> <br />
            </Box>

            <Label style={{ marginRight: "27%" }}>Email:</Label>

            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "55ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "" }}
            >
              <TextField
                id="filled"
                label=""
                name="email"
                value={this.state.email}
                onChange={this.handleChange}
                variant="filled"
              />
            </Box>
            <br />
            <Label style={{ marginRight: "22.5%" }}>Phone Number:</Label>
            <br />
            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "55ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "" }}
            >
              <TextField
                id="filled"
                name="phoneNumber"
                label=""
                value={this.state.phoneNumber}
                onChange={this.handleChange}
                variant="filled"
              />
            </Box>
            <br />
            <Label style={{ marginRight: "26%" }}>Address:</Label>

            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "55ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "" }}
            >
              <TextField
                id="filled"
                label="Permanent Address:"
                variant="filled"
                name="permanentAddress"
                value={this.state.permanentAddress}
                onChange={this.handleChange}
              />
              <br /> <br />
              <TextField
                id="filled"
                label="Secondary Address :"
                name="secondaryAddress"
                variant="filled"
                value={this.state.secondaryAddress}
                onChange={this.handleChange}
              />
              <br /> <br />
            </Box>

            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "25ch" },
              }}
              noValidate
              autoComplete="off"
            >
              <TextField
                id="filled"
                label="City:"
                variant="filled"
                value={this.state.city}
                name="city"
                onChange={this.handleChange}
                style={{ marginRight: "1.8%" }}
              />
              &nbsp; &nbsp;
              <TextField
                id="filled"
                label="State:"
                value={this.state.state}
                name="state"
                onChange={this.handleChange}
                variant="filled"
              />
              <br />
              <br />
              <TextField
                id="filled"
                label="Pin Code:"
                variant="filled"
                name="pinCode"
                value={this.state.pinCode}
                onChange={this.handleChange}
                style={{ marginRight: "16%" }}
              />
            </Box>
            <br />
            <h3>Booking Information</h3>
            <Row>
              <Col>
                <Label style={{ marginRight: "23.5%" }}>Check-in Date</Label>
                <Box
                  component="form"
                  sx={{
                    "& > :not(style)": { m: 1, width: "25ch" },
                  }}
                  noValidate
                  autoComplete="off"
                  style={{ marginRight: "16%" }}
                >
                  <TextField
                    id="filled"
                    label=""
                    name="checkIn"
                    variant="filled"
                    type="date"
                    value={this.state.checkIn}
                    onChange={this.handleChange}
                  />
                </Box>
              </Col>
              <Col style={{ marginTop: "-4.9%", marginLeft: "28%" }}>
                <Label style={{ marginRight: "22.5%" }}>Check-out Date</Label>
                <Box
                  component="form"
                  sx={{
                    "& > :not(style)": { m: 1, width: "25ch" },
                  }}
                  noValidate
                  autoComplete="off"
                  style={{ marginRight: "16%" }}
                >
                  <TextField
                    id="filled"
                    label=""
                    type="date"
                    value={this.state.checkOut}
                    name="checkOut"
                    onChange={this.handleChange}
                    variant="filled"
                  />
                </Box>
              </Col>
            </Row>
            <br />
            <Row>
              <Col>
                <Label style={{ marginRight: "18%" }}>
                  Number of guest in room:
                </Label>
                <Box
                  component="form"
                  sx={{
                    "& > :not(style)": { m: 1, width: "25ch" },
                  }}
                  noValidate
                  autoComplete="off"
                  style={{ marginRight: "16%" }}
                >
                  <TextField
                    id="filled"
                    label=""
                    name="numberOfGuest"
                    value={this.state.numberOfGuest}
                    onChange={this.handleChange}
                    variant="filled"
                  />
                </Box>
              </Col>
              <Col style={{ marginTop: "-4.9%", marginLeft: "28%" }}>
                <Label style={{ marginRight: "18%" }}>Room Number:</Label>
                {/* <Box
                  component="form"
                  sx={{
                    "& > :not(style)": { m: 1, width: "25ch" },
                  }}
                  noValidate
                  autoComplete="off"
                  style={{ marginRight: "16%" }}
                >
                  <select
                    value={this.state.roomId}
                    onChange={this.handleChange}
                    name="roomId"
                  >
                    <option value="">--select Room--</option>
                    {this.state.GetlistofRoom.map((data) => (
                      <option value={data.roomId}>{data.roomNumber}</option>
                    ))}
                  </select>
                </Box> */}
                <Box
                  component="form"
                  sx={{
                    "& > :not(style)": { m: 1, width: "25ch" },
                  }}
                  noValidate
                  autoComplete="off"
                  style={{ marginRight: "16%" }}
                >
         
                <TextField
          id="filled"
          select
          variant="filled"
          label=""
          value={this.state.roomId}
                    onChange={this.handleChange}
                    name="roomId"
        
          
        >
          
                    {this.state.GetlistofRoom.map((data) => (
                      <option value={data.roomId}>{data.roomNumber}</option>
                    ))}
          {/* {Gender.map((option) => (
            <MenuItem key={option.value} value={option.value}>
              {option.label}
            </MenuItem>
          ))} */}
        </TextField>
        </Box>
              </Col>
            </Row>
           <br/>
            <br />
            <Label style={{ marginRight: "23%" }}>Total Amount:</Label>
            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "25ch" },
              }}
              noValidate
              autoComplete="off"
              style={{ marginRight: "16%" }}
            >
              <TextField
                id="filled"
                label=""
                name="totalAmount"
                value={this.state.totalAmount}
                onChange={this.handleChange}
                variant="filled"
              />
            </Box>
            <br />

            <Label style={{ marginRight: "20%" }}>Special Requirements:</Label>
            <Box
              component="form"
              sx={{
                "& > :not(style)": { m: 1, width: "55ch" },
              }}
              noValidate
              autoComplete="off"
            >
              <TextField
                id="filled"
                label=""
                variant="filled"
                value={this.state.specialRequest}
                name="specialRequest"
                onChange={this.handleChange}
              />
            </Box>
            <br />
            <Button
              variant="contained"
              style={{
                backgroundColor: "#305de2",
                color: "white",
                padding: "11px 27px 9px",
                border: "none",
              }}
              onClick={this.handleSubmit}
            >
              SUBMIT
            </Button>
          </Form>
        </div>
     
    );
  }
}
{
  /* <Row className="cntnrstyle">
              <Col xs="3" sm={{offset:"1"}}>
              <Label>Name<span style={{color:"red"}}>*</span></Label>
              <Input 
                      type="name" 
                    //   name="username" 
                    //   onChange={this.changehandler}
                    //   onBlur={this.getUserExist}
                    //   value={this.state.username}
              />
             </Col>
            </Row> */
}

{
  /* <FormControl component="fieldset">
      <FormLabel component="legend">Are you travelling for work?</FormLabel>
      <RadioGroup row aria-label="Work" name="row-radio-buttons-group">
        <FormControlLabel value="YES" control={<Radio />} label="Yes" />
        <FormControlLabel value="NO" control={<Radio />} label="No" />
        {/* <FormControlLabel
          value="disabled"
          disabled
          control={<Radio />}
          label="other"
        /> */
}
