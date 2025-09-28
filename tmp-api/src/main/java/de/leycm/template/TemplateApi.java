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
 * Main API interface exposed to users.
 * Implementations should be registered via {@link TemplateApiProvider}.
 * </p>
 */
public interface TemplateApi {

    /**
     * Example function exposed by the API.
     * @return a string result
     */
    String aFunction();

}
