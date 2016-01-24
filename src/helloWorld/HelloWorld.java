package helloWorld;

import javacard.framework.APDU;
import javacard.framework.Applet;
import javacard.framework.ISO7816;

/**
 * @noinspection ClassNamePrefixedWithPackageName, ImplicitCallToSuper, MethodOverridesStaticMethodOfSuperclass, ResultOfObjectAllocationIgnored
 */
public class HelloWorld extends Applet {

    protected HelloWorld() {
        register();
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        new HelloWorld();
    }

    /**
     * @noinspection UnusedDeclaration
     */
    public void process(APDU apdu) {
        byte[] buffer = apdu.getBuffer();
        short lc = apdu.setIncomingAndReceive();
        apdu.setOutgoingAndSend(ISO7816.OFFSET_CDATA, lc);
    }
}