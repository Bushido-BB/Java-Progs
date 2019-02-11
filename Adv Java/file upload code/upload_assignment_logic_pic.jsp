
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*" %>
<%
/////////////////////////////////////////  Img upload code  ////////////////////////////////////////////////////////
    try
    {
        String type2="";
        String dept="";
        String cls="";
        String sem="";
        String imgg="";    
        String about_assign="";    
        
     boolean isMultipart = ServletFileUpload.isMultipartContent(request);
     if(isMultipart)
     {
        FileItem item=null;
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
			
        List items=null;
        
        try
        {
            items = upload.parseRequest(request);
        }
        
        catch(FileUploadException e)
        {
            e.printStackTrace();
        }
        
        Iterator itr = items.iterator();
		    
		  
        while (itr.hasNext())
        {
            item = (FileItem) itr.next();
                
                if (item.isFormField())
                {
                    String itemName1 = item.getFieldName();
                    String value=item.getString();
          
                    
                    if(itemName1.equals("type")) //control's name - textbox name
                    {
                           type2=value;//variable name                
                    }
                    else if(itemName1.equals("dept")) //control's name - textbox name
                    {
                           dept=value;//variable name                
                    }
                    else if(itemName1.equals("cls")) //control's name - textbox name
                    {
                           cls=value;//variable name                
                    }
                    else if(itemName1.equals("sem")) //control's name - textbox name
                    {
                           sem=value;//variable name                
                    }
                    else if(itemName1.equals("desc")) //control's name - textbox name
                    {
                           about_assign=value;//variable name                
                    }
                    /*else if(itemName1.equals("password")) //control's name - textbox name
                    {
                           password=value;//variable name                
                    }*/
                }
                else
                {
                    String type=item.getContentType();
                    long size=item.getSize()/1024; //bytes
                  
                    
                    if(size==0)
                    {
                        imgg = "pic.jpg";
                    }
                   
                    else
                    {
                       
/* image inside imgg variable */   imgg=new java.util.Date().getTime()+item.getName();
                    
                    String path=config.getServletContext().getRealPath("/") + "//teacher_assignment//" + imgg;
                    File savefile=new File(path); 
                            
                    item.write(savefile); 
                    }
		    
                    
                }  /////// else end ////////
              
            }  ///// while end  /////// 
        
        
        try
        {
            
            
        Connection con=DB_logic.DB.myDB();
        PreparedStatement pstmt2 = con.prepareStatement("insert into assignment(`type`,`dept`,`cls`,`sem`,`assign`,`about_assign`) values(?,?,?,?,?,?)");
        pstmt2.setString(1,type2);
        pstmt2.setString(2,dept);
        pstmt2.setString(3,cls);
        pstmt2.setString(4,sem);
        pstmt2.setString(5,imgg);
        pstmt2.setString(6,about_assign);
        int flag1=pstmt2.executeUpdate();
        
        if(flag1>0)
        {
            response.sendRedirect("upload_assignment_design.jsp?mms=102");
        }
        else
        {
            response.sendRedirect("upload_assignment_design.jsp?mms=103");
        }
       }
       catch(Exception e)
       {
           out.print("Error with DB is --> "+e);
       }
         
    
    } /////////////// if(miltipart) end //////////////////
     
}////////  try end ////// 
catch(Exception e)
{
    e.printStackTrace();
}
            
/////////////////////////////////////////  Img upload code  ////////////////////////////////////////////////////////

%>