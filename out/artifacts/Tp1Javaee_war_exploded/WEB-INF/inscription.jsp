<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Page Inscription</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<c:import url="index.jsp"/>
<form action="inscription" method="post">
    <fieldset>
        <legend>Inscription utilisateur</legend>
        <table border="0">
            <tr>
                <td>Nom</td>
                <td><input type="text" name="nom" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['nom']}"/></span></td>
            </tr>
            <tr>
                <td>Prénom</td>
                <td><input type="text" name="prenom" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['prenom']}"/></span></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" id ="email" name="email" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['email']}"/></span></td>
            </tr>
            <tr>
                <td>Date de Naissance</td>
                <td><input type="date" name="dateNaissance" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['dateNaissance']}"/></span></td>
            </tr>
            <tr>
                <td>Téléphone</td>
                <td><input type="tel" name="telephone" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['telephone']}"/></span></td>
            </tr>
            <tr>
                <td>Sexe</td>
                <td>
                    <input type="radio" name="sexe" value="M" />M
                    <input type="radio" name="sexe" value="F" />F
                </td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['sexe']}"/></span></td>
            </tr>
            <tr>
                <td>Mot de passe</td>
                <td><input id="pass1" type="password" name="password" value="" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['password']}"/></span></td>
            </tr>
            <tr>
                <td>Confirmer mot de passe</td>
                <td><input id="pass2" type="password" name="password" value="" /></td>
                <td>*</td>
                <td><span class="error"><c:out value="${erreurs['password']}"/></span></td>
            </tr>
            <tr>
                <td>Pays</td>
                <td><select name="pays">
                    <option value="Espagne">Espagne</option>
                    <option value="France">France</option>
                </select></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Valider" /><input
                        type="reset" value="Cancel" /></td>
                <td></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
