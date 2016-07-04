Beginning:

- [ ] I wanted to write `try-catch` w/o `try-catch`. Looked into Javaslang `Try`:
      
        Try.of(() -> mayThrowExceptionHere())
           .map(value -> ...)
           .getOrElse(valueIfExceptionWasThrown)
          
- [ ] [Javaslang library - more functional Java 8]( http://www.javaslang.io/ ) 
- [ ] [Grzegorz Piwowarek's talk at Confitura]( http://slides.com/pivovarit/javaslang-functional-java-done-right )
- [ ] Then another talk on which Javaslang was compared to libs like Guava as the must-have lib
- [ ] [Java8 issues]( http://slides.com/pivovarit/javaslang-functional-java-done-right#/7 )
- [ ] [mutability isn't nice]( http://slides.com/pivovarit/javaslang-functional-java-done-right#/16 )
- [ ] [Javaslang types]( http://www.javaslang.io/javaslang-docs/images/javaslang-overview.png )

Middle:

- [ ] [Tuples]( http://www.javaslang.io/javaslang-docs/#_tuples )
- [ ] Functions as alternative to `BiFunction`, `Consumer`, and other [Java 8 functional interfaces]( http://www.informit.com/articles/article.aspx?p=2171751&seqNum=3 )
- [ ] [Functions: composition, lifting, currying, memoization]( http://www.javaslang.io/javaslang-docs/#_functions )
- [ ] [Values: Option, Try, Lazy, Either, Future, Validation]( http://www.javaslang.io/javaslang-docs/#_values )
- [ ] [filtering out empty optionals while retrieving values]( http://slides.com/pivovarit/javaslang-functional-java-done-right#/28 )
- [ ] [`Stream.from`]( http://www.javadoc.io/doc/io.javaslang/javaslang/2.0.2 )
- [ ] [many actions to perform on Stream]( http://slides.com/pivovarit/javaslang-functional-java-done-right#/36 )
- [ ] [Pattern Matching - slides from 39 to 43]( http://slides.com/pivovarit/javaslang-functional-java-done-right#/39 )
- [ ] [Pattern Matching: performing side-effects]( http://www.javaslang.io/javaslang-docs/#_syntactic_sugar )
- [ ] my code samples

Ending:

- [ ] [extra modules]( http://www.javaslang.io/ )
- [ ] Maybe we can use it as first step into FP w/o writing Scala?
