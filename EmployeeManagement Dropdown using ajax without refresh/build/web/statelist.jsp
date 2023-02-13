<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<option value="0">Select a Province</option>
<c:forEach var="province" items="${StateList}">
    <option value= ${province.getProvinceCode()} <c:if test="${province.getProvinceCode() == User.getStateCode()}">selected</c:if>> 
        ${province.getProvinceName()}  </option>
    </c:forEach>
