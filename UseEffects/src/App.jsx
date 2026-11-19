import React, { useEffect, useState } from 'react'

const App = () => {
  const [formData, setFormData] = useState({
    name:'',
    email:'',
    password:''
  })
  useEffect(() => {
    console.log("form data update", formData);
  }, [formData])

  const handleChange = (e) => {
  setFormData({
    ...formData,
    [e.target.name]: e.target.value,
  })
}

  const handleSubmit = (e) => {
    e.preventDefault();
    alert("registration successful");
    console.log(formData);
  }


  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input type="text" name="name" placeholder="enter name" value={formData.name} onChange={handleChange}/>
        <br />
        <input type="email" name="email" placeholder="enter email" value={formData.email} onChange={handleChange}/>
        <br />
        <input type="password" name="password" placeholder="enter password" value={formData.password} onChange={handleChange}/>
        <br />
        <button type='submit'>Register</button>
      </form>
    </div>
  )
}

export default App
