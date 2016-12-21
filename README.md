# Defect reporting application

Aim of defect reporting application is to represent defects in various forms. Defect consists of attributes like severity (e.g. hi, medium, low, but values can vary), affected versions (notice plural), date of creation, name, description.

Next views should be created:
- Table view
- Pie chart view
- Scatter plot diagram which has date as X axis and severity as Y axis

For each view filtering can be created. Information relevant to filtering are severity, creation date, affected version.

Recommended tech stack:
- Java 8
- Spring (Spring Boot, Spring Data ...)
- D3 (v4) for diagrams
- H2 or MySQL for storage
