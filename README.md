IntelliJ IDEA JavaCard Project Template
=====================================

This is a template project for Java Card development using IntelliJ IDEA IDE.

Setup
=====================================

1.	Install latest 1.6.x Java SDK from here. (Java SE 6 Update xx JDK). 1.8 and next Java versions should also be ok. Just ensure javac can emit *.class files in 1.2 version (-source and -target command line switches)
1.	Open project using IDEA’s `File` -> `Open project`
1.	Go to `Project` -> `Project Structure` -> `SDKs` and add JDK you installed on step 1. If there is already something, you can delete it before adding newly installed JDK
1.	Go to `File` -> `Project Structure` -> `Libraries`. Remove current Classes entry. Then add either `lib\Egate\lib\api.jar` or `\lib\jc221\lib\api.jar` depending on the card type you develop applets for.
1.	Click on the `helloWorld`` package in the Project view and press Shift-F6 to rename it to the name you like. The same goes to `HelloWorld` applet.
1.	Open `Common.properties`` file and setup everything you need there according to comments, including path to JDK installation folder. Uncomment/comment entries, that control which card platform is the target.
1.	Open `build.xml` (this is an [`Ant`](http://ant.apache.org/) build package so you need `Ant` plugin to be installed in IDEA) and correct entries, that follow `${APPLETAIDPREFIX}` to suit your AID.
1.	To build applet, use [`Ant`](http://ant.apache.org/) window on the right of the screen. Use binarize.all.egate to build applets for egate cards (experimental) and `binarize.all.standard` for Gemalto TOPs and similiar.
1.	Target files will be in the \out\helloWorld\javacard folder where helloWorld is your package name

If you have more than one applet in the project, edit build.xml and add a second entry under each <target> tag with the info you need.

Now you have build your applet using IDEA's menu '`Build` -> `Make project`.