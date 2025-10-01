/**
 * LECP-LICENSE NOTICE
 * <br><br>
 * This Sourcecode is under the LECP-LICENSE. <br>
 * License at: <a href="https://github.com/leycm/leycm/blob/main/LICENSE">GITHUB</a>
 * <br><br>
 * Copyright (c) LeyCM <leycm@proton.me> <br>
 * Copyright (c) maintainers <br>
 * Copyright (c) contributors
 */
package de.leycm.template;

/**
 * <p>
 * Central access class for the Template API.
 * Provides static methods that delegate calls to the registered API implementation.
 * This class cannot be instantiated.
 * </p>
 */
public final class Template {

    private Template() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /**
     * Delegates to the registered Template API implementation.
     *
     * @return a sample function result
     * @throws IllegalStateException if no API implementation has been registered
     */
    public static String aFunction() {
        return TemplateApiProvider.get().aFunction();
    }

}
