import React from 'react'
import NameForm from './NameForm';

export default function NameList(props) {

  const insertname=(name)=>{
  props.insertnewname(name)
  }

  const removename = (name) =>{
    props.removeoldname(name)
  }

  const modifyname =(name)=>{
    props.modifyintoname(name)
  }

  return (
    <div>
        <ul>
            {props.namearr.map((nm,index,arr)=><li key={index}>{index+1}. {nm}</li>)}
        </ul>
        <NameForm addnewname = {insertname} deleteoldname={removename} updateintoname={modifyname}></NameForm>
    </div>
  )
}
