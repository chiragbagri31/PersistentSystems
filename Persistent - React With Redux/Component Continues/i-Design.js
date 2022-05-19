// App.js
import React, { Component } from "react";
import './App.css';

import InputField from './lib/user/InputField.js';
import SelectField from './lib/user/SelectField.js';

class App extends Component 
{
  render = () => 
  {
    const data = [ ["input",1],["select",1], 
                    ["input",2],["select",2],
                    ["input",3],["select",3]];

    return (
      <div>
        <h1>Form Fields</h1>
        <div className="container">
          {data.map((item, index) => {
            if (item[0] === "input" && index % 2 === 0) 
            {
              return(<InputField value={item[1]}/>);
            } 
            else 
            {
              return(<SelectField value={item[1]} />);
            }
          })}
        </div>
      </div>
    );
  };
}

export default App;




// InputField.js
import React from "react";

function InputField(props)
{
    return(
        <div className="field">
            <label>Text Field {props.value}</label>
            <br/>
            <input type="text" placeholder="Type your Text" />
        </div>
    );
}

export default InputField;




// SelectField.js
import React from "react";

function SelectField(props)
{
  return(
    <div className="field">
       <label>Select Field {props.value}</label>
        <br/>
        <select>
            <option>One</option>
            <option>Two</option>
        </select>
    </div>
  );
}
export default SelectField;
