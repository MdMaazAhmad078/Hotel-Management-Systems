import React, { Component } from "react";
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Container, Row, Col, Button } from "reactstrap";
import MenuItem from '@material-ui/core/MenuItem';
import Box from '@material-ui/core/Box';
import TextField from '@material-ui/core/TextField';
import axios from 'axios';

export default class Booking_List extends Component {
    constructor(props) {
        super(props);
        this.state = { 
          GetlistofRoom: [],
          flag:false,
         }
    
      }
    getListOfRoomMethod = () =>{
        axios.get("http://127.0.0.1:8081/Controller/ GetListOfRoom")
    
        .then(response => {
          console.log('response', response.data)
          if(response.status===200)
          {
            console.log('in if condition')
            this.setState({
              GetlistofRoom: response.data
          })
    
          }
        else{
          this.setState({
            GetlistofRoom: []
        })
        }
    
          
        })
      }
      componentDidMount() {
        this.getListOfRoomMethod();
       }
      
    render() {
        const {GetlistofRoom} = this.state


        const columns =[
            {
                Header: 'S.No',
                accessor: 'SNo',
                Cell: (props) => <span className="number">{props.index + 1}</span>,
                filterable: false,
            },
           
            {
                Header: 'Room No',
                accessor: 'roomNumber',
            },
            {
                Header: 'Floor No',
                accessor: 'floorNo',
            },
            {
                Header: 'Status',
                accessor: 'status',
            },
            {
                Header: 'No Of Bed',
                accessor: 'bedNumber',
            },
            {
                Header: 'View',
                accessor: 'view',
            },
            {
                Header: 'Room Type',
                accessor: 'roomType',
            },
            {
                Header: 'Price Pre Night',
                accessor: 'pricePerNight',
            },
           
            
        ];
      return (
        <React.Fragment>
             <Container  fluid={true}  >
             <Row style={{marginLeft:"1px"}}>
                
        
                     <b
                       style={{ color: "#0d007e", cursor: "pointer" }}
                     >
                       <h2 style={{marginBottom:"-0.5%"}}>Rooms</h2>
                     </b>
                     
                 </Row>
                 <br></br>
                
       
                 <ReactTable
                   className="-striped -highlight tblwid"
                   data={GetlistofRoom}
                   columns={columns}
                   filterable
                  
                  
                  
                 />
             </Container>
        </React.Fragment>
      );
    }
  }