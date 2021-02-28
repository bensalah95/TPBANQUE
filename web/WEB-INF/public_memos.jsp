<%-- 
    Document   : public_memos
    Created on : 26 févr. 2021, 10:47:02
    Author     : marye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="Menu.jsp"%>
        <div class="container center">
            <h1 class="titre">Hello  <span class="name">${user.prenom} ${user.nom}  </span> </h1>

        </div>


        <div>
            <div class="row">
                <c:forEach items="${memos}" var="m">
                    <div class="col-sm-3 mt-4">
                        <div class ="card card-perso-box">
                            <div class="card-body">

                                <div class="row">
                                    <div class="col-sm-6">
                                        <strong class="text-info">
                                            ${m.dateCreation} ${m.user.prenom}
                                        </strong>

                                    </div>
                                    <div class="col-sm-6">
                                        <strong class="text-info">
                                            $ ${m.user.prenom}
                                        </strong>
                                    </div></div>
                                <p class="pres"> ${m.contenu}</p>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
        <%-- 
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> Contenue </th>
                        <th> Date création </th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${memos}" var="m">
                        <tr>
                            <td>${m.id}</td>
                            <td>${m.contenu}</td>
                            <td>${m.dateCreation}</td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        --%>
    </body>
</html>
