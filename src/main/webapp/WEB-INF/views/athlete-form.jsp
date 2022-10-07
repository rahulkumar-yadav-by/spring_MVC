<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>



<!DOCTYPE html>
<html>
<head><title>Add Athlete</title></head>
<body>

    <h2>Athlete Form</h2>
    <form:form action="showAthleteDetails" modelAttribute="athlete">

        <label>Name </label>
        <form:input path="name" />

        <form:select path="country" >
            <form:option label="IN" value="India"/>
            <form:option label="US" value="USA"/>
            <form:option label="NE" value="Nepal" />
            <form:option label="AU" value="Australia" />
        </form:select>

        <form:radiobutton path="rank" label="Grade 1" value="A" />
        <form:radiobutton path="rank" label="Grade 2" value="B" />


        <input type="submit" value="Enter" />
    </form:form>


</body>
</html>