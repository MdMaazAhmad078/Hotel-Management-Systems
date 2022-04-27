import { Button } from '@material-ui/core'
import React ,{useState} from 'react'
import "./Banner.css"
// import Search from './Search'
import {useHistory} from "react-router-dom"
import OIP from "../Assests/OIP.jpg";

function Banner() {
    const history = useHistory();

    const [showSearch,setShowSearch] = useState(false)
    return (
        <div className="banner">
           
            <div className="banner_info">
                <h2>Get down and stretch your imagination</h2>
                <h5>plan a different kind of gateway to uncover the hidden gems near you.</h5>
                <Button onClick={()=>{history.push("/search")}}variant="outlined"> Explore Nearby</Button>
            </div>
        </div>
    )
}

export default Banner
