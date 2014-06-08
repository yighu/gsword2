  <h3>Write down your thought and email it to your self </h3>
<br/>
   <table>
        <tr>
  <td>Title 

 </td>
            <td>
                <g:textField name="notetitle" value="${note?.title}"/>
            </td>
        </tr>
       <tr>
           <td>   Email
          </td>
           <td>
               <g:textField name="noteemail" value="${note?.email}"/>
           </td>
       </tr>
      <tr>
           <td> Notes</td>
           <td>
               <g:textArea name="notetxt" rows="25" cols="50" value="${note?.ref}${note?.note}" onblur="keepnote();"/>
           </td>
       </tr>

    </table>
  <table>

     <tr >
         <td>
 <button type="button" onclick="sendnotemail();">Email Note to the Above address</button>         </td>
         <td>
          <div id="emailnotestatus"/> 
         </td>
     </tr>
  </table>
