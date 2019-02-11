<%@include file="staff_header.jsp"%>


<div class="bg-page py-5">
        <div class="container">
            <!-- main-heading -->
            <h2 class="main-title-w3layouts mb-2 text-center text-white">Upload Assignment</h2>
            <!--// main-heading -->
            
                    <%
                    if(request.getParameter("mms")!=null && request.getParameter("mms").equals("101"))
                    {
                    %>        
                          
                    <div class="alert alert-primary"> <h1> Email Already in Use....! </h1> </div>
                    
                    <%    
                    }
                    %>
                    
                    <%
                    if(request.getParameter("mms")!=null && request.getParameter("mms").equals("102"))
                    {
                    %>        
                          
                    <div class="alert alert-primary"> <h1> Assignment Inserted....! </h1> </div>
                    
                    <%    
                    }
                    %>
                    
                    <%
                    if(request.getParameter("mms")!=null && request.getParameter("mms").equals("103"))
                    {
                    %>        
                          
                    <div class="alert alert-primary"> <h1> Assignment NOT Inserted....! </h1> </div>
                    
                    <%    
                    }
                    %>
                    
                    <%
                    if(request.getParameter("mms")!=null && request.getParameter("mms").equals("123"))
                    {
                    %>        
                          
                    <div class="alert alert-primary"> <h1> Please fill all values....! </h1> </div>
                    
                    <%    
                    }
                    %>
                    
                    <%
                    if(request.getParameter("mms")!=null && request.getParameter("mms").equals("104"))
                    {
                    %>        
                          
                    <div class="alert alert-primary"> <h1> Email Not Valid....! </h1> </div>
                    
                    <%    
                    }
                    %>
            
            
            <div class="form-body-w3-agile text-center w-lg-50 w-sm-75 w-100 mx-auto mt-5">
                <form action="upload_assignment_logic_pic.jsp" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Type</label>
                        <input type="text" name="type" value="Student" class="form-control" placeholder="Enter type" required="" readonly="">
                    </div>
                    
                    <div class="form-group">
                                    <label for="exampleFormControlSelect1">Department</label>
                                    <select style="text-align-last: center; height:40px;" name="dept" class="form-control" id="exampleFormControlSelect1">
                                        <option>IT</option>
                                        <option>MATHS</option>
                                        <option>SCIENCE</option>
                                        <option>COMMERCE</option>
                                    </select>
                    <!--<input type="text" name="dept" class="form-control" placeholder="Enter department" required="">-->                
                    </div>
                    
                    <div class="form-group">
                                    <label for="exampleFormControlSelect2">Class</label>
                                    <select style="text-align-last: center; height:40px;" name="cls" class="form-control" id="exampleFormControlSelect2">
                                        <option>BCA</option>
                                        <option>MCA</option>
                                        <option>BTech</option>
                                        <option>MTech</option>
                                        <option>BA Math</option>
                                        <option>MA Math</option>
                                        <option>BscCsc</option>
                                        <option>Msc physics</option>
                                        <option>Bcom</option>
                                        <option>Mcom</option>
                                    </select>
                    <!--<input type="text" name="dept" class="form-control" placeholder="Enter department" required="">-->                
                    </div>
                    
                    <div class="form-group">
                                    <label for="exampleFormControlSelect3">Semester</label>
                                    <select style="text-align-last: center; height:40px;" name="sem" class="form-control" id="exampleFormControlSelect3" >
                                        <option>Semester 1</option>
                                        <option>Semester 2</option>
                                        <option>Semester 3</option>
                                        <option>Semester 4</option>
                                        <option>Semester 5</option>
                                        <option>Semester 6</option>
                                        <option>Semester 7</option>
                                        <option>Semester 8</option>
                                    </select>
                    <!--<input type="text" name="dept" class="form-control" placeholder="Enter department" required="">-->                
                    </div>
                    
                    <div class="form-group">
                        <label>Assignment</label>
                        <input type="file" name="img" value="Student" class="form-control" placeholder="Enter type" required="" readonly="">
                    </div>
                    
                    <div class="form-group">
                        <label>About Assignment</label>
                        <textarea name="desc" class="form-control" required="">
                            
                        </textarea>
                    </div>
                    
                    <button type="submit" class="btn btn-primary error-w3l-btn mt-sm-5 mt-3 px-4">Upload</button>
                </form>
            </div>

            
        </div>
    </div>
<%@include file="footer.jsp" %>