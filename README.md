# Inicjalizacja repozytorium Git
git init

# Utworzenie pliku .gitignore z przykładowymi wpisami
echo "*.class
*.jar
/out/
/.idea/
*.iml" > .gitignore

# Dodanie plików do obszaru staging
git add .

# Utworzenie i przejście na gałąź feature-test
git checkout -b feature-test

# Zatwierdzenie zmian z komunikatem
git commit -m "Kolokwium: Dzielniki calkowite"
