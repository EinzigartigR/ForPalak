import React from 'react'
import NameForm from './NameForm';

export default function NameList(props) {
  return (
    <div>
        <ul>
            {props.namearr.map((nm,index,arr)=><li key={index}>{index+1}. {nm}</li>)}
        </ul>
        <NameForm></NameForm>
    </div>
  )
}
