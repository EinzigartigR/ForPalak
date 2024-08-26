import React, { useEffect, useState } from 'react'

export default function (props) {
  let [name,setname]=useState("");
  useEffect(()=>{
    console.log(name)
  },[name])

  const handleChange=(event)=>{
    setname(event.target.value)
  }

  const addname= () => {
    console.log("in name form add");
    if(name === "" || name.trim().length==0){
      alert("name cannot be empty")
      return
    }
    props.addnewname(name)
    setname=("")
  }

  const deletename= () => {
    console.log("in name form delete");
    props.deleteoldname(name)
    setname("")
  }

  const updatename= () => {
    console.log("in name form add");
    props.updateintoname(name)
  }

  return (
    <div>
      <form>
        Name : <input type='text' name='name' id='name'
        value={name}
      onChange={handleChange}></input><br></br>
        <button type='button' id='btn' value="add" onClick={addname}>Add Name</button>
        <button type='button' id='btn' value="delete" onClick={deletename}>Delete Name</button>
        <button type='button' id='btn' value="update" onClick={updatename}>Update Name</button>
      </form>
    </div>
  )
}
