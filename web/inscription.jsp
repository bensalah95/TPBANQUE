
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire d'inscription</title>
        <link rel="stylesheet" href="style.css">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    </head>
    <body>

        <form action="Inscription" method="post">
            <div class = "form-group ">
                <label for ="inputNom"> Nom </label>
                <input type = "Text"  class = "form-control"   placeholder = "Nom"  name="nom" required>
            </div>


            <div class = "form-group ">
                <label for ="inputPrenom"> Prenom </label>
                <input type = "Text"  class = "form-control" placeholder = "Prenom"  name="prenom" required >
            </div>

            
            <div class = "form-group ">
                <label for ="inputEmail"> E-mail </label>
                <input type = "email"  class = "form-control"  id = "inputEmail" required  placeholder = "Email"  name="login">
            </div>

            
            <div  class = "form-group">
                <label  for = "inputPassword"> Mot de passe </label>
                <input type = "password"  class = "form-control"  id = "inputPassword"  placeholder = "Password" name="mdp" >
            </div>

            
            <div  class = "form-group">
                <label  class = "form-check-label"> 
                <input  type = "checkbox">  Se souvenir de  moi </label>
            </div>

            <button type="submit" class="btn btn-primary">Valider </button>
            <button type="button" class="btn btn-success" onclick="location.href = 'login'">Se connecter</button>

                <p class="text-success text-center"> ${message} </p>

        </form>
    </body>
</html>
