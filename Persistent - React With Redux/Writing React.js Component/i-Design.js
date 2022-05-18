// App.js
import React from "react";
import Profile from "./Profile"

function App()
{
    return (
        <>
        <Profile title="My Profile" profileIcon="./images/profileicon.png">
            <table>
                <thead>
                </thead>
                <tbody>
                    <tr>
                        <td>Name : </td>
                        <td>Salrin</td>
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td>"salrin@gmail.com"</td>
                    </tr>
                    <tr>
                        <td>Mobile : </td>
                        <td>9876564532</td>
                    </tr>
                    <tr>
                        <td>Age : </td>
                        <td>24</td>
                    </tr>
                    <tr>
                        <td>Address : </td>
                        <td>Jaint Street,Mumbai</td>
                    </tr>
                </tbody>
            </table>
        </Profile></>
    );
}
export default App;



// Profile.js
import React from "react";

function Profile(props)
{
    return (
        <div className="container">
            <h1>TechCrunch</h1>
            
            <div id="profile-info" className="profile-info">
                <h2>{props.title}</h2>
                <img src={props.profileIcon} id="profile-icon" className="profile-icon"></img>
            </div>

            <div id="profile-details" className="details">
                {props.children}
            </div>
        </div>
    );
}
export default Profile;
