/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.viatra.dse

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DdslStandaloneSetup extends DdslStandaloneSetupGenerated {

    def static void doSetup() {
        new DdslStandaloneSetup().createInjectorAndDoEMFRegistration()
    }
}
