import { useState } from "react";
import { useHistory } from "react-router-dom";

const Create = () => {

 const [fullName, setfullName] = useState('');
  const [address, setAddress] = useState('');
  const [phoneNumber, setphoneNumber] = useState('');
  const [email, setEmail] = useState('');
  const history = useHistory();


  const handleSubmit = (e) => {
    e.preventDefault();
    const user = { fullName, address, phoneNumber, email };

    fetch('http://localhost:8080/users/add', {
      method: 'POST',
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(user)
    }).then(() => {
      // history.go(-1);
      history.push('/');
    })
  }
    return ( 

        <div className="create">
        <h2>Add a New User</h2>
        <form onSubmit={handleSubmit}>
          <label>Full Name:</label>
          <input 
            type="text" 
            required 
            value={fullName}
            onChange={(e) => setfullName(e.target.value)}
          />
          <label>Address:</label>
          <textarea
            required
            value={address}
            onChange={(e) => setAddress(e.target.value)}
          ></textarea>
           <label>Phone Number:</label>
             <textarea
            required
            value={phoneNumber}
            onChange={(e) => setphoneNumber(e.target.value)}
          ></textarea>
          <label>Email:</label>
             <textarea
            required
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          ></textarea>
         <button>Add User</button>
        </form>
      </div>
     );
}
 
export default Create;