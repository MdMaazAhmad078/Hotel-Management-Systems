import React, { Component } from "react";

export default class Footer extends Component {
  render() {
    return (
      <div className="footer">
        <p
          style={{
            padding: "20px",
            backgroundColor: "#F3F1F5",
            fontSize: "12px",
          }}
        >
          All Rights Reserved. Hotel Management Model © 2021 | LM SUITE SMS © V1.0.0
          <br />
          contact@shalimar.com
        </p>
      </div>
    );
  }
}
