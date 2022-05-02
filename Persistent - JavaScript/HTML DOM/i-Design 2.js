<html>
    <head>
        <style>
            td {
                border: 1px solid black;
            }
        </style>
        <script>
            function load()
            {
                var x = document.firstElementChild.innerHTML;
                document.body.style.backgroundColor = "";
            }
        </script>
    </head>
    <body onload="load()">
    <table>
        <tr>
            <td style="background-color:#ffa07a;">row1 col1</td>
            <td>row1 col2</td>
            <td>row1 col3</td>
            <td>row1 col4</td>
            <td>row1 col5</td>
        </tr>
        <tr>
            <td>row2 col1</td>
            <td style="background-color:#ffa07a;">row2 col2</td>
            <td>row2 col3</td>
            <td>row2 col4</td>
            <td>row2 col5</td>

        </tr>
        <tr>
            <td>row3 col1</td>
            <td>row3 col2</td>
            <td style="background-color:#ffa07a;">row3 col3</td>
            <td>row3 col4</td>
            <td>row3 col5</td>

        </tr>
        <tr>
            <td>row4 col1</td>
            <td>row4 col2</td>
            <td>row4 col3</td>
            <td style="background-color:#ffa07a;">row4 col4</td>
            <td>row4 col5</td>

        </tr>
        <tr>
            <td>row5 col1</td>
            <td>row5 col2</td>
            <td>row5 col3</td>
            <td>row5 col4</td>
            <td style="background-color:#ffa07a;">row5 col5</td>

        </tr>
    </table>

</body>
</html>
