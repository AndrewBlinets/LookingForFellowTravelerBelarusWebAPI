<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script src="<c:url value="/resources/javascript/index/index.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/index/index.css"/>">
<div>
   <div class="class-flex">
       <form class="form">
       Посмотреть результаты с <input type="date" name="calendar" class="calendar_start">
       </form>
       <form class="form">
       по <input type="date" name="calendar" class="calendar_finish">
       </form>
           <button  class="button-for-result">Показать</button>
           <button  class="button-for-all-result">Показать все</button>
   </div>
    <div class="error-message"></div>

    <div>
        <br>
        <table id="table" style="display:none;">
            <thead id = "thead">
            <tr>
                <td >
                    <div class="class-flex">
                        <div><b>№</b></div>
                        <div class="by-id-up">▲</div>
                        <div class="by-id-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>Название категории</b></div>
                        <div class="by-name-category-up">▲</div>
                        <div class="by-name-category-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>Код услуги</b></div>
                        <div class="by-cod-service-up">▲</div>
                        <div class="by-cod-service-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>Название услуги</b></div>
                        <div class="by-name-service-up">▲</div>
                        <div class="by-name-service-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>УНП, Организация</b></div>
                        <div class="by-org-up">▲</div>
                        <div class="by-org-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>Комментарий</b></div>
                        <div class="by-comment-up">▲</div>
                        <div class="by-comment-down">▼</div>
                    </div>
                </td>
                <td >
                    <div class="class-flex">
                        <div><b>Дата</b></div>
                        <div class="by-date-up">▲</div>
                        <div class="by-date-down">▼</div>
                    </div>
                </td>
            </tr>
            </thead>
            <tbody id = "tbody">
            </tbody>
        </table>
    </div>
</div>