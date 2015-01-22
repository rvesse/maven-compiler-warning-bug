# Introduction

This is a trivial repository that shows a strange issue with the maven compiler warning and its treatment of warnings.

It contains a single source file that will produce Java compiler warnings and has two executions of the compiler plugin.  One should run with no warnings while the other with full warnings.

    > mvn clean compile

However the execution without any warnings always produces a warning despite the plugin settings saying that it should not