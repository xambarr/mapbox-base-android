package com.mapbox.annotation.navigation.module

import com.mapbox.annotation.MODULE_CONFIGURATION_CLASS_NAME_FORMAT

/**
 * Annotation that marks an implementation class of the Mapbox navigation module.
 *
 * @param type module type
 * @param skipConfiguration Defaults to true. If set to `true`, the generator will not expose the module provider.
 * The SDK will then try to:
 * 1. Call an empty constructor of the annotated implementation class.
 * 2. Get a Kotlin `object` instance.
 * 3. Inject predefined Mapbox parameters. This is for internal and Mapbox default modules use only.
 *
 * If set to `false`, the SDK will generate a static provider, with class name equal to: [MODULE_CONFIGURATION_CLASS_NAME_FORMAT].
 * For example, for [MapboxNavigationModuleType.name] equal to "LibraryLoader",
 * the instance's provider can be assigned using `Mapbox_LibraryLoaderModuleConfiguration#moduleProvider`.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class MapboxNavigationModule(val type: MapboxNavigationModuleType, val skipConfiguration: Boolean = true)