package com.acme;

import org.apache.maven.plugins.annotations.*;

@Mojo(name = "hello",
        requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME,
        requiresProject = true,
        defaultPhase = LifecyclePhase.COMPILE)
public class HelloMojo extends org.apache.maven.plugin.AbstractMojo {

    public void execute() {
        getLog().info("HELLO");
    }

}