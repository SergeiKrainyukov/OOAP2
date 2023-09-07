В языке Java максимальная поддержка концепции класса как модуля. 

Во-первых, класс выступает базовой синтаксической единицей в виде отдельного файла, и в виде автономно компилируемой сущности
Во-вторых, существующий механизм наследования подразумевает, что наследник будет иметь доступ к полям и методам
родителя, а также возможность переопределять их, если потребуется. Создавая новый класс(модуль) на основе родителя, мы 
заимствуем существенную часть базовой функциональности, и дополняем его новой.
В-третьих, имеется возможность строго определить зависимости между классами (модулями), например, через конструктор.
В-четвертых, присутствует возможность создавать свои библиотеки и импортировать их в проекты.
В-пятых, можно создать условное "пространство имен", в виде некоторого класса, содержащего статические константы