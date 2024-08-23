import React from 'react'

export default function NameTable(props) {
  return (
    <div>
      <table border={2}>
        {props.namearr.map((ob,index) => 
        <tr key={index}>
          <td>{ob}</td>
        </tr>
      )}
      </table>
    </div>
  )
}
