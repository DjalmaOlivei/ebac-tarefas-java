<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Simple JSP Calculator</title>
	<style>
		body { font-family: Arial, sans-serif; background:#f7f7f7; padding:40px; }
		.calc { background:#fff; padding:20px; border-radius:6px; box-shadow:0 2px 8px rgba(0,0,0,0.08); width:320px; }
		.row { margin-bottom:12px; }
		input[type="number"] { width:100%; padding:8px; box-sizing:border-box; }
		select, button { padding:8px; }
		.result { margin-top:14px; padding:10px; background:#f0f8ff; border:1px solid #cfe8ff; }
		.error { margin-top:14px; padding:10px; background:#fff4f4; border:1px solid #ffd2d2; }
	</style>
</head>
<body>
<div class="calc">
	<h2>Simple Calculator</h2>
	<form method="post">
		<div class="row">
			<label>Number 1</label>
			<input type="number" step="any" name="num1" value="<%= request.getParameter("num1") != null ? request.getParameter("num1") : "" %>" required />
		</div>
		<div class="row">
			<label>Number 2</label>
			<input type="number" step="any" name="num2" value="<%= request.getParameter("num2") != null ? request.getParameter("num2") : "" %>" required />
		</div>
		<div class="row">
			<label>Operation</label>
			<select name="op">
				<option value="+" <%= "+".equals(request.getParameter("op")) ? "selected" : "" %>>Add (+)</option>
				<option value="-" <%= "-".equals(request.getParameter("op")) ? "selected" : "" %>>Subtract (-)</option>
				<option value="*" <%= "*".equals(request.getParameter("op")) ? "selected" : "" %>>Multiply (*)</option>
				<option value="/" <%= "/".equals(request.getParameter("op")) ? "selected" : "" %>>Divide (/)</option>
			</select>
		</div>
		<div class="row">
			<button type="submit">Calculate</button>
			<button type="reset">Clear</button>
		</div>
	</form>

	<%-- Server-side processing --%>
	<%
		String s1 = request.getParameter("num1");
		String s2 = request.getParameter("num2");
		String op = request.getParameter("op");
		if (s1 != null && s2 != null && op != null) {
			try {
				double n1 = Double.parseDouble(s1);
				double n2 = Double.parseDouble(s2);
				double res = 0;
				boolean valid = true;
				switch (op) {
					case "+": res = n1 + n2; break;
					case "-": res = n1 - n2; break;
					case "*": res = n1 * n2; break;
					case "/":
						if (n2 == 0) { valid = false; }
						else { res = n1 / n2; }
						break;
					default: valid = false; break;
				}
				if (valid) {
	%>
	<div class="result">
		<strong>Result:</strong> <%= res %>
	</div>
	<%
				} else {
	%>
	<div class="error">
		<strong>Error:</strong> Invalid operation or division by zero.
	</div>
	<%
				}
			} catch (NumberFormatException e) {
	%>
	<div class="error">
		<strong>Error:</strong> Please enter valid numbers.
	</div>
	<%
			}
		}
	%>
</div>
</body>
</html>
