UNWIND [1, 3, 2] AS ints
RETURN ints
ORDER BY ints DESC
