<!DOCTYPE html>
<html lang="pl-PL">
<head>
    <title>Tweets</title>
    <meta charset="UTF-8">
</head>
<body>

    <form name="searchForm" action = "/tweet-search">
    <h3>Szukaj po:
        <select name= "option">
                <option value="lang">Język</option>
                <option value="country">Kraj</option>
                <option value="city">Miasto</option>
        </select>
        <input name= "text" type="text">
        <input type = "submit">
     </h3>
    </p>
    </form>
</body>
</html>