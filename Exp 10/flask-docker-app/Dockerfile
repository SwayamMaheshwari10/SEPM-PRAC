# Base image
FROM python:3.11-slim

# Set working directory
WORKDIR /app

# Install dependencies
RUN pip install flask

# Copy files
COPY . .

# Set environment variable
ENV FLASK_APP=app.py

# Default command
CMD ["flask", "run", "--host=0.0.0.0", "--port=5000"]