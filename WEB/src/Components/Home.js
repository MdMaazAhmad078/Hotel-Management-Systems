import React, { Component } from "react";
import "./Home.css"
// import { Card, Button } from 'react-bootstrap'; 
import Card from "./Card";
import Banner from './Banner'


export default class Home extends Component {
  render() {
    return (
                <div className="home">
               <br/>
                    <Banner />
                   
                    <div className='home_section'>
            <Card
                src="https://a0.muscache.com/im/pictures/eb9c7c6a-ee33-414a-b1ba-14e8860d59b3.jpg?im_w=720"
                title="Online Experiences"
                description="Unique activities we can do together, led by a world of hosts."
            />
            <Card
                src="https://a0.muscache.com/im/pictures/15159c9c-9cf1-400e-b809-4e13f286fa38.jpg?im_w=720"
                title="Unique stays"
                description="Spaces that are more than just a place to sleep."
            />
            <Card
                src="https://a0.muscache.com/im/pictures/fdb46962-10c1-45fc-a228-d0b055411448.jpg?im_w=720"
                title="Entire homes"
                description="Comfortable private places, with room for friends or family."
            />
            </div>
            <div className='home_section'>
            <Card
                src="https://media.nomadicmatt.com/2019/airbnb_breakup3.jpg"
                title="Standard (Double) Bedroom With Side View"
                description="Enjoy the amazing view on coach with a glass of wine"
                price=" INR 5,300/night"
            />
            <Card
                src="https://thespaces.com/wp-content/uploads/2017/08/Courtesy-of-Airbnb.jpg"
                title="PStandard (Twin) Bedroom Flat With"
                description="Superhost with a stunning view with balcony and Air-Condition,Refregetor"
                price="INR 8,000/night"
            />
            <Card
                src="https://media.nomadicmatt.com/2018/apartment.jpg"
                title="Standard (Single) Bedroom"
                description="Superhost with great amenities and a fabolous shopping complex nearby"
                price="INR 3,500/night"
            />
                    
                    </div>
                </div>
      
            );
  }
}

