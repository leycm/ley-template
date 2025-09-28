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
 * Core implementation of the {@link TemplateApi}.
 * This class registers itself with the {@link TemplateApiProvider} upon instantiation.
 * </p>
 */
public class TemplateBootstrap implements TemplateApi {

    /**
     * Registers this instance with the {@link TemplateApiProvider}.
     */
    public TemplateBootstrap() {
        TemplateApiProvider.register(this);
    }

    /**
     * Implementation of the example function from the API.
     * @return a sample string
     */
    @Override
    public String aFunction() {
        return "I am a function";
    }

    /**
     * Optional shutdown logic to unregister the API implementation.
     */
    public void shutdown() {
        TemplateApiProvider.unregister();
    }

}
