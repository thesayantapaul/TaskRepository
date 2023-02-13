<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<option value="0">Select a District</option>
<c:forEach var="district" items="${DistList}">
    <option value= ${district.getDistCode()}  <c:if test="${district.getDistCode() == User.getDistCode()}">selected</c:if> >
        ${district.getDistName()}  </option>
</c:forEach>
    
    
   >